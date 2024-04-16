package com.library.book;

public enum category {
	SCIENCE(){
	@Override
	public String toString() {
		return "Science";
	}
	},
	ROMANCE(){
		@Override
		public String toString() {
			return "Romance";
		}
	},
	HISTORICAL(){
		@Override
		public String toString() {
			return "Historical";
		}
	},
	HORROR(){
		@Override
		public String toString() {
			return "Horror";
		}
	},
	DRAMA(){
		@Override
		public String toString() {
			return "Drama";
		}
	}
	
}
