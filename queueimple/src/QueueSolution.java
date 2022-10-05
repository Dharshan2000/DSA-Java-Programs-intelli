import javax.sound.midi.Soundbank;

class QueueUsingArray{
    int rear_Q;
    int capacityOfQueue;
    int[] q1;
    QueueUsingArray(int size){
        capacityOfQueue=size;
        q1=new int[capacityOfQueue];
        rear_Q = 0;
    }
    void enqueue(int value) {
        if (rear_Q == capacityOfQueue) {
            System.out.println("queue is already full, cannot insert element");
        } else {
            q1[rear_Q] = value;
            rear_Q++;
        }
    }
    void dequeue()
    {
        if(rear_Q==0){
            System.out.println("queue is empty , there is nothing delete");
        }
        else {
            for(int i=0;i<rear_Q-1;i++)
            {
                q1[i]=q1[i+1];
            }
            rear_Q--;
        }

    }
    void display()
    {
        if(rear_Q==0){
            System.out.println("queue is empty ");
        }
        else
        {
            for (int i=0;i<rear_Q;i++)
            {
                System.out.print(q1[i]+" ");
            }

        }
    }
}

public class QueueSolution {
    public static void main(String args[])
    {
        QueueUsingArray q2=new QueueUsingArray(5);
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(6);
        q2.enqueue(8);
        q2.enqueue(10);
        q2.display();
        q2.dequeue();
        System.out.println();
        q2.display();
    }
}

