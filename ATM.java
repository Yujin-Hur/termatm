package atmnew;



import java.util.*;
import javax.swing.JOptionPane;



public class ATM {
   
	public static int one, five; //ATM기 안에 들어있는 만 원권, 오 만원권 지폐 개수
	public static transaction tr = new transaction();
	//constructor
	public ATM() {
		one = 10000; five = 10000;
	}
   
	//입금
	static void Deposit(DataBase db, String id, long cash) {
		db.setBalance(id, db.getBalance(id) + cash);
		tr.add(id + " deposit: " + String.valueOf(cash)+"\n");
	}
	//출금
	static void WithDraw(DataBase db, String id, long cash) {
		db.setBalance(id, db.getBalance(id) - cash);
		tr.add(id + " withdraw: " + String.valueOf(cash)+"\n");
	}
	//송금

	//잔액 확인
	static long DisplayCash(DataBase db, String id) {
		return db.getBalance(id);
	}
	
	static String LogPrint(int idx){
		return tr.get(idx);
		//System.out.printf(tr.get(idx));

	}
   
	}
