package multithreading_new;

class Chat {
	boolean flag = false;
	public synchronized void Question(String msg) {
        if (flag==true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
      }
        System.out.println(msg);
        flag = true;
        notify();// a method from object class which provide signal to next thread
    }
	
	public synchronized void Answer(String msg) {
        if (flag==false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        flag = false;
        notify();
    }
}

class Teacher implements Runnable {
    Chat m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

    public Teacher(Chat m) {
        this.m = m;
        new Thread(this, "Teacher").start();
        
        /* thread t=new Thread(this, "Teacher");
         * t.start();        
         */
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

class Student implements Runnable {
    Chat m;
    String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

    public Student(Chat m) {
        this.m = m;
        new Thread(this, "Student").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}
public class InterThreadCommunication1 {
    public static void main(String[] args) {
        Chat m = new Chat();
        new Teacher(m);
        new Student(m);
    }
}
