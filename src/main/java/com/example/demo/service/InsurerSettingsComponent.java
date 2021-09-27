package com.example.demo.service;

import com.example.demo.model.CheckType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties("insurer")
public class InsurerSettingsComponent {
    private boolean check;

    private List<CheckType> checkTypes;
}
