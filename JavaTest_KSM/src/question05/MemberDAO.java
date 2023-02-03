package question05;

import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberDTO> listDTO = null;

	public MemberDAO() {
		super();
		listDTO = new ArrayList<MemberDTO>();
	}
	
	public boolean Add(MemberDTO dtoAdd) {
		return listDTO.add(dtoAdd);
	}	

	public boolean Edit(int iIndex, MemberDTO dtoEdit) {
		listDTO.set(iIndex, dtoEdit);
		return true;
	}	
	
	public ArrayList<MemberDTO> SelectAll() {
		return listDTO;
	}
	
}
