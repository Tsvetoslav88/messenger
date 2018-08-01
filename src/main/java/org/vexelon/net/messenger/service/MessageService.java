package org.vexelon.net.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.vexelon.net.messenger.model.Message;

public class MessageService {
	public List<Message> getMessages(){
		Message m1 = new Message(1L, "Hello world!", "Tsetso");
		Message m2 = new Message(1L, "Hello Jersey!", "Tsetso");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
