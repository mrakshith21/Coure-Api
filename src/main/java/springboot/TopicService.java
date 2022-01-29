package springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import springboot.topic.Topic;

@Service
public class TopicService {
	
	List<Topic> topicList = new ArrayList<>(Arrays.asList(new Topic("01", "Discrete Maths", "All about proofs"),
			(new Topic("02", "Drawing", "Worst course")), 
			(new Topic("03", "Discrete Maths", "All about proofs"))));
	
	public List<Topic> getAllTopics() {
		return topicList;
	}
	
	public Topic getTopic(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i < topicList.size(); i++) {
			if(topicList.get(i).getId().equals(id)){
				System.out.println("Found");
				topicList.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		for(int i = 0; i < topicList.size(); i++) {
			if(topicList.get(i).getId().equals(id)){
				topicList.remove(i);
				return;
			}
		}
		
	}
	
}
