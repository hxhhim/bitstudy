package Ex07;

public class MemberDao {
	Member[] members = new Member[10];
	int length = 0;
	
	void insert(Member member) {
		members[length++] = member;
	}
	Member[] selectList() {
		Member[] dataArray = new Member[length];
		for(int i=0; i<length; i++) {
			dataArray[i] = this.members[i];
		}
		return dataArray;
	}
	Member selectOne(int no) {
		if(no>=0&&no<length) {
			return members[no];
		}
		return null;
	}
	void update(Member member) {
		members[member.no-1]= member;
	}
	int delete(int no) {
		if (no>=0 && no<length) {
			for(int i=no; i<length-1;i++) {
				members[i] = members[i+1];
				members[i].no--;
			}
			this.length--;
			Member.cnt--;
			
			return 1;
		}
		return 0;
	}
	int size() {
		return length;
	}
}
