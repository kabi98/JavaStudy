package mini_main;

import java.util.ArrayList;

import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;

import model.CntPLevelDAO;
import model.CntPLevelDTO;
import model.CntPQDAO;
import model.CntPQDTO;
import view.KChart;

public class MiniMain {

	public static void main(String[] args) {
		System.out.println("*** Start ***");

		chartPercentQuestion();
		chartCountQuestion();
		chartPercentLevel();
		chartCountLevel();
				
//		
//		chartTest = new KChart();
//		chart = chartTest.barChartCount(listDTO);
//		
//		ChartFrame frame2 = new ChartFrame("문제별 성공,시도횟수", chart);
//
//		
//		frame2.setSize(800, 400);
//		frame2.setLocation(1000, 0);
//		frame2.setVisible(true);
		
		System.out.println("*** Finish ***");
	}
	
	static void chartCountLevel() {
		ArrayList<CntPLevelDTO> listDTO = null;

		CntPLevelDAO DAO = null;

		DAO = new CntPLevelDAO();

		listDTO = DAO.SelectAll();
		
		KChart chartTest = new KChart();
		JFreeChart chart = chartTest.barChartLevelCount(listDTO);
		
		ChartFrame frame1 = new ChartFrame("난이도별 성공, 시도 횟수", chart);

		frame1.setSize(800, 400);
		frame1.setVisible(true);
	}
	
	static void chartPercentLevel() {
		ArrayList<CntPLevelDTO> listDTO = null;

		CntPLevelDAO DAO = null;

		DAO = new CntPLevelDAO();

		listDTO = DAO.SelectAll();
		
		KChart chartTest = new KChart();
		JFreeChart chart = chartTest.barChartLevelPercent(listDTO);
		
		ChartFrame frame1 = new ChartFrame("난이도별 성공률", chart);

		frame1.setSize(800, 400);
		frame1.setVisible(true);
	}
	
	static void chartPercentQuestion() {
		ArrayList<CntPQDTO> listDTO = null;

		CntPQDAO DAO = null;

		DAO = new CntPQDAO();

		listDTO = DAO.SelectAll();
		
		KChart chartTest = new KChart();
		JFreeChart chart = chartTest.barChartPercent(listDTO);
		
		ChartFrame frame1 = new ChartFrame("문제별 성공률", chart);

		frame1.setSize(800, 400);
		frame1.setVisible(true);
	}
	
	static void chartCountQuestion() {
		ArrayList<CntPQDTO> listDTO = null;

		CntPQDAO DAO = null;

		DAO = new CntPQDAO();

		listDTO = DAO.SelectAll();
		
		KChart chartTest = new KChart();
		JFreeChart chart = chartTest.barChartCount(listDTO);
		
		ChartFrame frame1 = new ChartFrame("문제별 성공, 시도수", chart);

		frame1.setSize(800, 400);
		frame1.setVisible(true);
	}
	
	
}
