package Aufgabe01;

public class Temperature {
	
	public static void main(String [] args){
		
		double [] outsideTemp = new double [] {10.0, 25.0,30.0};
		
		double [] tempCurve = computeTemperature(outsideTemp,15.0,20.0,18.0);
		
		for(int i=0;i<tempCurve.length;i++){
			System.out.println(tempCurve[i]);
		}
		
		
		
	}
	public static double[] computeTemperature(double[] tempOutside, double tempMin, double tempMax, double tempInit)
	{
		double[] tempCurve = new double[tempOutside.length + 1];
		tempCurve[0] = tempInit;
		for (int i = 0; i < tempOutside.length; i++)
		{
			double tempMix = (tempCurve[i] + tempOutside[i]) / 2;
			if(tempMix < tempMin)
			{
				tempMix += 5;
			}
			else if(tempMix > tempMax)
			{
				tempMix -= 5;
			}
			tempCurve[i+1] = tempMix;
		}
		return tempCurve;
	}
}
