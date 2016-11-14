//Text processing


wget http://kdd.ics.uci.edu/databases/20newsgroups/20_newsgroups.tar.gz

tar -xvzf 20_newsgroups.tar.gz

/home/ec2-user/spark/mldata


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
export SPARK_HOME="/home/edureka/spark/spark-1.6.0-bin-hadoop2.6"
export SPARK_HOME="/home/ec2-user/spark/spark-1.6.0-bin-hadoop2.6"

$SPARK_HOME/bin/spark-shell --driver-memory 2g
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


import org.apache.log4j.{ Level, Logger }

  val rootLogger = Logger.getRootLogger()
    rootLogger.setLevel(Level.ERROR)

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
val path = "file:///home/ec2-user/spark/mldata/20_newsgroups/*"

val path = "file:///home/edureka/edudata/20_newsgroups/*"


val path = "/home/ec2-user/sparkml/mini_newsgroups*"

val rdd = sc.wholeTextFiles(path)


val text = rdd.map { case (file, text) => text }




// Tokenizing the text data
//val whiteSpaceSplit = text.flatMap(t => t.split(" ").map(_.toLowerCase))
val nonWordSplit = text.flatMap(t => t.split("""\W+""").map(_.toLowerCase))
val regex = """[^0-9]*""".r
val filterNumbers = nonWordSplit.filter(token => regex.pattern.matcher(token).matches)

val tokenCounts = filterNumbers.map(t => (t, 1)).reduceByKey(_ + _)

val stopwords = Set(
	"the","a","an","of","or","in","for","by","on","but", "is", "not", "with", "as", "was", "if",
	"they", "are", "this", "and", "it", "have", "from", "at", "my", "be", "that", "to"
)



val rareTokens = tokenCounts.filter{ case (k, v) => v < 2 }.map { case (k, v) => k }.collect.toSet
//val tokenCountsFilteredAll = tokenCountsFilteredSize.filter { case (k, v) => !rareTokens.contains(k) }

def tokenize(line: String): Seq[String] = {
	line.split("""\W+""")
		.map(_.toLowerCase)
		.filter(token => regex.pattern.matcher(token).matches)
		.filterNot(token => stopwords.contains(token))
		.filterNot(token => rareTokens.contains(token))
		.filter(token => token.size >= 2)
		.toSeq
}



val tokens = text.map(doc => tokenize(doc))

import org.apache.spark.mllib.feature.Word2Vec
val word2vec = new Word2Vec()

// we do this to generate the same results each time

word2vec.setSeed(42) 


val word2vecModel = word2vec.fit(tokens)

word2vecModel.findSynonyms("hockey", 20).foreach(println)
word2vecModel.findSynonyms("windows", 20).foreach(println)

word2vecModel.findSynonyms("linux", 20).foreach(println)

word2vecModel.findSynonyms("software", 20).foreach(println)

word2vecModel.findSynonyms("winter", 20).foreach(println)

word2vecModel.findSynonyms("laptop", 20).foreach(println)

word2vecModel.findSynonyms("president", 20).foreach(println)

word2vecModel.findSynonyms("court", 20).foreach(println)

word2vecModel.findSynonyms("boston", 20).foreach(println)

word2vecModel.save(sc, "file:///home/edureka/edudata/mlmodel/data")

word2vecModel.save(sc, "file:///home/ec2-user/spark/mldata/model")



import org.apache.spark.mllib.feature.Word2VecModel


val word2vecModel = Word2VecModel.load(sc,"file:///home/edureka/edudata/mlmodel/data")
val word2vecModel = Word2VecModel.load(sc,"file:///home/ec2-user/spark/mldata/model")

