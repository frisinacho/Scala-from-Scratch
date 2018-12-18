import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

val sparkConf = new SparkConf().setAppName("StreamingWords")
val ssc = new StreamingContext(sc,Seconds(1))
