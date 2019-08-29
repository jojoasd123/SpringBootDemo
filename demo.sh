cd ~/App/SpringBootDemo/
git fetch --caller git reset --hard origin/master
git pull
mvn clean compile -DskipTests package
pid=$(ps aux | grep "demo" | grep -v grep | awk'{print $2}')
echo "kill -9 $pid"
kill -9 $pid
STATUS=$?
if [ $STATUS -eq 0 ]
then
    echo "Kill previous process successfully."
    echo "Begin restart community"
    java -jar target/demo-0.0.1-SNAPSHOT.jar &
    disown
    echo "Community restart successfully."
else
    echo "Kill previous process failed."
fi