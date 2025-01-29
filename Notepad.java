package Swing;

import javax.swing.*;

public class Notepad {
	JMenu m_menu, m_submenu,edit,view;
	JMenuItem menu_i1, menu_i2,menu_i3,menu_i4,menu_i5,menu_i6,menu_i7,menu_i8,menu_i9,menu_i10,menu_i11,undo,cut,copy,paste,delete,search_with_bing,find
		,find_next,find_previous,replace,go_to,time_date,font,select_all,zoom,status_bar,word_wrap,zoom_in,zoom_out;
	Notepad()
	{
		JFrame menu_f = new JFrame("Notepad");
		JMenuBar menu_mb = new JMenuBar();
		m_menu = new JMenu("File");
		m_submenu = new JMenu("Submenu");
		menu_i1 = new JMenuItem("New Tab");
		menu_i2 = new JMenuItem("New Window");
		menu_i3 = new JMenuItem("Open");
		menu_i4 = new JMenuItem("Save");
		menu_i5 = new JMenuItem("Save As");
		menu_i6 = new JMenuItem("Save All");
		menu_i7 = new JMenuItem("Page Setup");
		menu_i8 = new JMenuItem("Print");
		menu_i9 = new JMenuItem("Close Tab");
		menu_i10 = new JMenuItem("Close Window");
		menu_i11= new JMenuItem("Exit");
		
		m_menu.add(menu_i1);
		m_menu.add(menu_i2);
		m_menu.add(menu_i3);
		m_menu.add(menu_i4);
		m_menu.add(menu_i5);
		m_menu.add(menu_i6);
		m_menu.addSeparator(); 
		m_menu.add(menu_i7);
		m_menu.add(menu_i8);
		m_menu.addSeparator(); 
		m_menu.add(menu_i9);
		m_menu.add(menu_i10);
		m_menu.add(menu_i11);
		menu_mb.add(m_menu);
		
		edit = new JMenu("Edit");
		undo = new JMenuItem("Undo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		delete = new JMenuItem("Delete");
		search_with_bing = new JMenuItem("Search With Bing");
		find = new JMenuItem("Find");
		find_next = new JMenuItem("Find Next");
		find_previous = new JMenuItem("Find Previous");
		replace = new JMenuItem("Replace");
		go_to = new JMenuItem("Go To");
		select_all = new JMenuItem("select_all");
		time_date = new JMenuItem("Time/Date");
		font = new JMenuItem("Font");
		edit.add(undo);
		edit.addSeparator(); 
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.addSeparator(); 
		edit.add(search_with_bing);
		edit.addSeparator(); 
		edit.add(find);
		edit.add(find_next);
		edit.add(find_previous);
		edit.add(replace);
		edit.add(go_to);
		edit.addSeparator(); 
		edit.add(select_all);
		edit.add(time_date);
		edit.addSeparator(); 
		edit.add(font);
		menu_mb.add(edit);
		
		view = new JMenu("View");
		zoom = new JMenu("Zoom");
		zoom_in = new JMenuItem("Zoom In");
		zoom_out = new JMenuItem("Zoom Out");
		status_bar = new JMenuItem("Status Bar");
		word_wrap = new JMenuItem("Word Wrap");
		view.add(zoom);
		view.add(status_bar);
		view.add(word_wrap);
		zoom.add(zoom_in);
		zoom.add(zoom_out);
		menu_mb.add(view);
		
		menu_f.setJMenuBar(menu_mb);
		menu_f.setSize(500,500);
		menu_f.setLayout(null);
		menu_f.setVisible(true);		
	}

	public static void main(String[] args) {
		new Notepad();
	}

}
