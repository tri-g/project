import { Component, OnInit } from '@angular/core';
import {   Users } from '../users';

import { Router, ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
	name:string;
	users:Users;
  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  	this.users = new Users();
  	this.name = this.route.snapshot.params['name']
}
}