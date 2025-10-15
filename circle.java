public class circle{
        public circle(double r)
        {
            r1 = r;
        }
        public double diameter(){
            return 2*r1;
        }
        public double area()
        {
            double a= Math.PI*r1*r1;
            return a;
        }
        public double circumference(){
            return 2*Math.PI*r1;
        }
        public double r1;

}


