package cn.tedu.cloudnote.service;

import java.util.List;
import java.util.Map;

import cn.tedu.cloudnote.entity.Note;

public interface NoteService {
	public List<Map<String,Object>>
			loadNotes(String bookId) throws
			NoteBookNotFoundException;
	public Note loadNote(String noteId)
			throws NoteNotFoundException;
	public boolean updateNote(String noteId,
					String noteTitle,
					String noteBody)
			throws NoteNotFoundException;
	public int deleteNote(String noteId);
}








