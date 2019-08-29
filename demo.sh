cd ~/App/SpringBootDemo/
git fetch --all
git reset --hard origin/master
git pull
mvn clean compile -DskipTests package
echo "stop server"
# shellcheck disable=SC1068
name = $(lsof -i:8080|tail -1|awk '"$1"!=""{print $2}')
if [ -z $name ]
then
  echo "No process can be used to killed!"
  java -jar target/demo-0.0.1-SNAPSHOT.jar &
  disown
  exit 0
fi
# shellcheck disable=SC1068
id = $(lsof -i:8080|tail -1|awk '"$1"!=""{print $2}')
kill -9 $id
echo "Kill previous process successfully."
echo "Begin restart demo"
java -jar target/demo-0.0.1-SNAPSHOT.jar &
disown
echo "Community restart successfully."

