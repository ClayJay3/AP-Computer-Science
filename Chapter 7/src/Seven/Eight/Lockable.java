package Seven.Eight;

public interface Lockable
{
	public void setKey(int keyPass);
	public void lock(int keyPass);
	public void unlock(int keyPass);
	public boolean locked();
}
