CPATH='.:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar'
set -e


rm -rf student-submission
rm -rf grading-area

mkdir grading-area

git clone $1 student-submission
echo 'Finished cloning'

echo "test"
# Draw a picture/take notes on the directory structure that's set up after
# getting to this point

# Then, add here code to compile and run, and do any post-processing of the
# tests
if [[ ! -f student-submission/ListExamples.java ]]
then
echo "Wrong file type submitted"
exit 1
fi

javac -cp ".;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar" *.java
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestListExamples > grade_output.txt


