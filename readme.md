
```
$ javac Hello.java
$ java Hello &
タスク0を開始しました
タスク9を開始しました
タスク8を開始しました
タスク7を開始しました
タスク6を開始しました
タスク5を開始しました
タスク4を開始しました
タスク3を開始しました
タスク2を開始しました
タスク1を開始しました
$ jps
29908 Hello
29996 Jps
$ jstack -l 29908
```