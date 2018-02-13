package com.nedmules.househunter.cucumber.stepdefs;

import com.nedmules.househunter.HousehunterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HousehunterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
