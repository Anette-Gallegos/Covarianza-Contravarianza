Class {
	#name : #B,
	#superclass : #A,
	#instVars : [
		'b'
	],
	#category : #foo
}

{ #category : #accessing }
B >> b [

	^ b
]

{ #category : #accessing }
B >> b: anObject [

	b := anObject
]
