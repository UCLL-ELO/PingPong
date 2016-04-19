/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong.math;

import pingpong.visual.Sensor;
import java.util.LinkedList;
import pingpong.Vector;

/**
 *
 * @author Dylan Gybels
 */
public class ApolloniusSolver {
    
    public static Vector calculateRange(Sensor s1, Sensor s2, Sensor s3){
   
        double x1 = s1.getVector().getX();
	double y1 = s1.getVector().getY();
	double r1 = s1.getRadiusDiff();
	double x2 = s2.getVector().getX();
	double y2 = s2.getVector().getY();
	double r2 = s2.getRadiusDiff();
	double x3 = s3.getVector().getX();
	double y3 = s3.getVector().getY();
	double r3 = s3.getRadiusDiff();
        
        double sensor1 = -1;
        double sensor2 = -1;
        double sensor3 = -1;
        
        double p11 = 2*x2 - 2*x1;
	double p21 = 2*x3 - 2*x2;

	double T12 = (2*y2 - 2*y1)/p11;
	double T13 = (x1*x1 - x2*x2 + y1*y1 - y2*y2 - r1*r1 + r2*r2)/p11;
	double T14 = (2*sensor2*r2 - 2*sensor1*r1)/p11;
	double T22 = (2*y3 - 2*y2)/p21-T12;

	double P = (T13-(x2*x2 - x3*x3 + y2*y2 - y3*y3 - r2*r2 + r3*r3)/p21)/T22;
	double Q = ((2*sensor3*r3 - 2*sensor2*r2)/p21-T14)/T22;
	double M = -T12*P-T13;
	double N = T14 - T12*Q;

	double a = N*N + Q*Q - 1;
        double b = 2*M*N - 2*N*x1 + 2*P*Q - 2*Q*y1 + 2*sensor1*r1;
        
        double rs = (-b-Math.sqrt(b*b-4*a*(x1*x1 + M*M - 2*M*x1 + P*P + y1*y1 - 2*P*y1 - r1*r1)))/(2*a);
        
        System.out.println("X: " + (M + N * rs) + " Y: " + (P + Q * rs));
        
        return new Vector((int) (M + N * rs), (int) (P + Q * rs));
    }
}
