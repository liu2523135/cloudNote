package cn.tedu.cloudnote.dao;

import java.util.List;
import java.util.Map;

import cn.tedu.cloudnote.entity.Note;

public interface NoteDao {
	public List<Map<String,Object>> 
				findByBookId(String bookId);
	public Note findByNoteId(String noteId);
	public int update(Note note);
	
	public int updateStatus(String noteId);
}








