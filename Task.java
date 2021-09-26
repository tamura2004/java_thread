public class Task extends Thread {
  int id;

  Task(int id) {
    this.id = id;
  }

  public void run() {
    try {
      System.out.printf("タスク%dを開始しました\n", this.id);
      Thread.sleep(300000);
      System.out.printf("タスク%dを終了しました\n", this.id);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
