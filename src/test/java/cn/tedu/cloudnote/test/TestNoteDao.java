package cn.tedu.cloudnote.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.tedu.cloudnote.dao.NoteDao;
import cn.tedu.cloudnote.entity.Note;

public class TestNoteDao extends TestBase{
	private NoteDao noteDao;
	@Before
	public void init(){
		noteDao=super.getContext().getBean(
				"noteDao", NoteDao.class);
	}
	//@Test
	public void test(){
		List<Map<String,Object>> list
		=noteDao.findByBookId(
				"fa8d3d9d-2de5-4cfe-845f-951041bcc461");
		for(Map note:list){
			System.out.println(note.get("id")
					+","+note.get("title"));
		}
	}
	//@Test
	public void testFindNoteById(){
		String id=
		"5565bda4-ddee-4f87-844e-2ba83aa4925f";
		Note note=noteDao.findByNoteId(id);
		System.out.println(note.getId()
				+","+note.getTitle());
	}
	@Test
	public void testUpdate(){
		Note note=new Note();
		String noteId=
				"5565bda4-ddee-4f87-844e-2ba83aa4925f";
		String noteTitle="Oracle Manage";
		String noteBody="Instance Manage";
		long lastTime=System.currentTimeMillis();
		note.setId(noteId);
		note.setTitle(noteTitle);
		note.setBody(noteBody);
		note.setLastModifyTime(lastTime);
		noteDao.update(note);
	}
}














