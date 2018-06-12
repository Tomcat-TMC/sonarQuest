package com.viadee.sonarQuest.dtos;

import com.viadee.sonarQuest.entities.Quest;
import com.viadee.sonarQuest.entities.Task;
import com.viadee.sonarQuest.entities.World;

import java.util.List;

public class WorldDto {

    private Long id;

    private String name;

    private String project;

    private String image;

    private Boolean active;

    private List<Quest> quests;

    private List<Task> tasks;

    public WorldDto() {
    }

    public WorldDto(Long id, String name, String project, Boolean active, List<Quest> quests, List<Task> tasks, String image) {
        this.id = id;
        this.name = name;
        this.project = project;
        this.active = active;
        this.quests = quests;
        this.tasks = tasks;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static WorldDto toWorldDto(World world) {
        WorldDto worldDto = null;
        if (world != null) {
            worldDto = new WorldDto(world.getId(), world.getName(),world.getProject(),world.getActive(), world.getQuests(),world.getTasks(), world.getImage());
        }
        return worldDto;
    }
    
    
}