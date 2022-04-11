package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.service.TopicService;

@RequestMapping("/topics")
@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("sampleTopics")
	public List<Topic> getTopic() {
		return topicService.getSampleTopics();
	}
	
	@RequestMapping("addTopic")
	public void addTopic(Topic topic) {
		topicService.addTopic(topic);
	}
}
