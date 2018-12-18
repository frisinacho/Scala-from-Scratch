import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

val sparkConf = new SparkConf().setAppName("StreamingWords")
val ssc = new StreamingContext(sc,Seconds(1))

val lines = ssc.socketTextStream("localhost",9000,StorageLevel.MEMORY_AND_DISK_SER)
val words = lines.flatMap(line => line.split(" "))
val countWords = words.map(x => (x,1)).reduceByKey((x,y) => x + y)
countWords.print()
