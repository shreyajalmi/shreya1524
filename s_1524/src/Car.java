
public class Car {
	int capacity;
int data;
	public Car(int IntCapacity) {
		// TODO Auto-generated method stub
this.capacity=IntCapacity;
System.out.println("Capacity:"+capacity);
	}
	public int getCapacity() {
		return capacity;
	}
	public void getEngineCapacity(int add)
	{
		capacity=capacity+add;
	}
}
