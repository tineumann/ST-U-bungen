package ST10;

public class ComputeAreas {
	static double computeAreas(IAreaComputable[] areas){
		double area = 0;
		for(IAreaComputable i : areas){
			area += i.computeArea();
		}
		return area;
	}
}
