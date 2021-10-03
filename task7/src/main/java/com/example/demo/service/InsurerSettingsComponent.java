package com.example.demo.service;

import com.example.demo.model.CheckType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@ConfigurationProperties("insurer")
public class InsurerSettingsComponent {
    private boolean check;

    private List<CheckType> checkTypes;
}
