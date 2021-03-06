import org.apache.spark.sql.SparkSession

object HelloWorld {
  def main(args: Array[String]) {
    val bigfile = "/data/mr/wordcount/input/big.txt" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val sc = spark.sparkContext
    var rdd = sc.textFile(bigfile)
    for(line <- rdd.take(10)){
	print(line)
    }
    spark.stop()
  }
}
