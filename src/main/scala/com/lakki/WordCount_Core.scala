package com.lakki


import org.apache.spark.{SparkConf, SparkContext}

object WordCount_Core {

  def main(args: Array[String]): Unit = {

    val inputFile= scala.io.Source.fromFile("C://personal//Hadoop//sud_prac//derby.log")
    /*for(line<- inputFile.getLines()){
      println(line)
    }*/
    val conf= new SparkConf().setMaster("local").setAppName("wordCount")

    val sc = new SparkContext(conf)

    val fileRDD =sc.parallelize(inputFile.getLines().toList)
    val splittedRDD = fileRDD.flatMap(x => x.split(" ")).map(x=>(x,1)).reduceByKey(_+_)
    splittedRDD.saveAsTextFile("out//count")
  }

}
