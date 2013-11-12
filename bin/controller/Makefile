JFLAGS = -cp

JAR = "/Users/nickgallimore/Documents/LeapSDK/lib/LeapJava.jar"
LIB = "/Users/nickgallimore/Documents/LeapSDK/lib"
JC = javac
FILE = Sample

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $(JAR) $(FILE).java

CLASSES = \
	$(FILE).java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

run:
	java $(JFLAGS) ".:$(JAR)" -Djava.library.path=$(LIB) $(FILE)