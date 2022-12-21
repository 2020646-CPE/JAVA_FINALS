cd phonebook

javac CRUD_Interface.java
javac -d . CRUD_Interface.java
javac MainF.java
javac -d . MainF.java
javac SimbaPhone.java
javac -d . SimbaPhone.java
    :: Running the Main Java File

echo Main-Class: phonebook.SimbaPhone > manifest.mf  

jar -cvfm SimbaPhone.jar manifest.mf phonebook/ *.class
jar -cvfm ../SimbaPhone.jar manifest.mf phonebook/ *.class    

cd ..
java -jar Phonebook.jar
