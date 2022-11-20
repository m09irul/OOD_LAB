package State;

public class Vibration implements MobileAlertState
{
    @Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("vibration...");
	}
}
