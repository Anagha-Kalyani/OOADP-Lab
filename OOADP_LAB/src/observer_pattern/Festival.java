package observer_pattern;
import java.util.*;
public abstract class Festival{
	public abstract void setState(double discount);
	public abstract void attach(Customer x);
	public abstract void detach(Customer x);
	public abstract void notifyAllObs();



}
