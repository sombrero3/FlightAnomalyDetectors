package test;

import java.util.List;

public interface TimeSeriesAnomalyDetector {
	void learnNormal(TimeSeries ts);
	List<AnomalyReport> detect(TimeSeries ts);
	GraphStruct display(String colName);
	
	
	class GraphStruct{
		String str;
		double threshold;
		Line l;
		Circle c;
		int feature1IDX;
		int feature2IDX;
		float minVal;
		float maxVal;
		float minYVal;
		float maxYVal;
		float[] zScores;

		public GraphStruct() {
			threshold = Float.MIN_VALUE;
			feature1IDX = Integer.MIN_VALUE;
			feature2IDX = Integer.MIN_VALUE;
			l = null;
			minVal = Float.MIN_VALUE;
			maxVal = Float.MAX_VALUE;
			minYVal = Float.MIN_VALUE;
			maxYVal = Float.MAX_VALUE;
			c = null;			
			zScores=null;
			str = null;
		}

		
		public double getThreshold() {
			return threshold;
		}


		public void setThreshold(double threshold) {
			this.threshold = threshold;
		}


		public int getFeature1IDX() {
			return feature1IDX;
		}


		public void setFeature1IDX(int feature1idx) {
			feature1IDX = feature1idx;
		}


		public int getFeature2IDX() {
			return feature2IDX;
		}


		public void setFeature2IDX(int feature2idx) {
			feature2IDX = feature2idx;
		}


		public float[] getzScores() {
			return zScores;
		}

		public void setzScores(float[] zScores) {
			this.zScores = new float[zScores.length];
			for(int i=0;i<zScores.length;i++)
				this.zScores[i] = zScores[i];
		}

		public float getMinYVal() {
			return minYVal;
		}

		public void setMinYVal(float minYVal) {
			this.minYVal = minYVal;
		}

		public float getMaxYVal() {
			return maxYVal;
		}

		public void setMaxYVal(float maxYVal) {
			this.maxYVal = maxYVal;
		}

		public float getMinVal() {
			return minVal;
		}

		public void setMinVal(float minVal) {
			this.minVal = minVal;
		}

		public float getMaxVal() {
			return maxVal;
		}

		public void setMaxVal(float maxVal) {
			this.maxVal = maxVal;
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}

		public Line getL() {
			return l;
		}
		public void setL(Line l) {
			this.l = l;
		}
		public Circle getC() {
			return c;
		}
		public void setC(Circle c) {
			this.c = c;
		}
		
		
	}
}
