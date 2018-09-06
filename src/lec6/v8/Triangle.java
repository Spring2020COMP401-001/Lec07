package lec6.v8;

interface Triangle {
	Point getA();
	void setA(Point p);
	Point getB();
	void setB(Point p);
	Point getC();
	void setC(Point p);
	Point[] getPoints();
	void setPoints(Point[] points);
	double getArea();
	double getPerimeter();
}