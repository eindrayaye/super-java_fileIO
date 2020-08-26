# super-java_fileIO

To read or write data from file we can either use character Stream or byte Stream.

Byte stream - it transfers data in form of bytes 

Tt will be faster to use because it is directly transfering data in form of bytes.


InputStream		      OutputStream

FileInputStream		  FileOutputStream

ObjectInputStream	  ObjectOutputStream

DataInputStream		  DataOutputStream




Character Stream: it will transfer data in form of unicode characters

when u want to have files in multiple languages.

Reader			Writer

FileReader		FileWriter

InputStreamReader	OutputStreamWriter

**************************************

<TRY IT YOURSELF - PROJECTS>

(1) Retreive the list of all files and folders under particular folder. you have to do deep traversing.

(2) Retreive the list of all files which has .txt extension under particular folder.



** More challenging Serializable/ Reading and writing (from / to) file or database? Try below the task number (3) and (4) ***
< The solutions are uploaded // Check (1) University.class (2) WriteUniCollege.java (3) ReadUniCollege.java>

(3)Create a University Object. University can have College when I Serialize University
it should automatically serialize College.

University
univCode
univName
object of College

College
collegecode
collegename
city

(4) Read the data from file and retreive the information about College from University
object.

