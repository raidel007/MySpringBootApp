package io.javabrains.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import io.javabrains.springbootstarter.topic.Topic;

@Service
public class TopicService {

	private List<Topic> sampleTopics = new ArrayList <> (Arrays.asList(
			new Topic ("Action", "Lots of Fighting", "1.0"),
			new Topic ("Romance", "Lots of kissing", "1.1"),
			new Topic ("Fantasy", "Lots of magic", "1.2")
			));
	
	public List<Topic> getSampleTopics() {
		return sampleTopics;
	}
	
	public void addTopic(Topic topic) {
		sampleTopics.add(topic);
	}
}
