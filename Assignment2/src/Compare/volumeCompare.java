package Compare;

import java.util.Comparator;

import Objects.Shape;

public class volumeCompare implements Comparator<Shape>{

	

	@Override
	public int compare(Shape s1, Shape s2) {
		if (s1.calcVolume() > s2.calcVolume())
    	{
    		return 1;
    	}
    	else if ( s1.calcVolume() < s2.calcVolume())
    	{
    		return -1;
    	}
    	
    	else 
    		return 0;
	}

}
