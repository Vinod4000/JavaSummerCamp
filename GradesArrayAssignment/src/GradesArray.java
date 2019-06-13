import java.util.*;

public class GradesArray {
	public double[] grades;
	
	
	GradesArray() {
		grades = new double[0];
	}
	
	GradesArray(double[] grades) {
		this.grades = grades;
	}
	
	static double avgArray(double[] grades) {
		 double sum = 0;
		 for (int i = 0; i < grades.length; i++) {
			 sum += grades[i];
		 }
		 return sum/grades.length;
	}
	
	static double medArray(double[] grades) {
		ArrayList<Double> grad = new ArrayList<Double>();
		for (int i = 0; i < grades.length; i++) {
			grad.add(grades[i]);
		}
		Collections.sort(grad);

		double med = grad.get(grad.size()/2);
		return med;
	}
	
	static double maxArray(double[] grades) {
		double max = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (max <= grades[i]) {
				max = grades[i];
			}
		}
		return max;
	}
	
	static double minArray(double[] grades) {
		double min = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if (min >= grades[i]) {
				min = grades[i];
			}
		}
		return min;
	}
	
	
	
	public static void main(String[] args) {
		GradesArray gra = new GradesArray(new double[]{88.5, 100.0, 67.0, 72.5, 80.0, 81.5, 85.0, 99.0, 95.0, 100.0, 50.0, 45.0, 85.0, 89.5, 92.0});
		System.out.println(avgArray(gra.grades));
		System.out.println(medArray(gra.grades));
		System.out.println(maxArray(gra.grades));
		System.out.println(minArray(gra.grades));
	}
	

}
