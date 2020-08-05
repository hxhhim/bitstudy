package step01.exam05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BoardDao2 {
	ArrayList<Board> list = new ArrayList<>();
	
	//���� �߻��ϸ� ������ �����ϱ�
	public BoardDao2() {
		File file = new File("board.dat");
		
		try {
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream in2 = new ObjectInputStream(in);
		Board board = null;
		while(true) {
			board = (Board)in2.readObject();
			list.add(board);
		}
		}catch(Exception e) {
			System.out.println("������ �дٰ� �����߻�");
		}
	}
	
	//���ܰ� �߻������� ������ �����ϸ�
	//������ ���� �޼��带 ������ʿ�����
	//������ ���ܸ� ó���ؾ� �ϴ� �������� �ִ�.
	void insert(Board board) {
		list.add(board);
		saveToFile();
	}
	List<Board> selectList(){
		return list;
	}
	
	Board selectOne(int no) {
		if(no>=0&&no<list.size()) {
			return list.get(no);
		}
		return null;
	}
	int update(Board board) {
		if(board.no>=0 &&board.no<list.size()) {
			list.set(board.no,board);
			saveToFile();
			return 1;
		}
		return 0;
	}
	int delete(int no) {
		if(no>=0 && no<list.size()) {
			list.remove(no);
			saveToFile();
			return 1;
		}
		return 0;
	}
	void saveToFile() {
		File file = new File("board.dat");
		
		try {
		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream out2 = new ObjectOutputStream(out);
		for(Board board: list) {
			out2.writeObject(board);
		}
		}catch(Exception e) {
			System.out.println("����Ÿ ����� ���� �߻�");
		}
	}
}