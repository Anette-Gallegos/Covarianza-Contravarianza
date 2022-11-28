Class {
	#name : #A,
	#superclass : #Object,
	#instVars : [
		'a'
	],
	#category : #foo
}

{ #category : #accessing }
A >> a [

	^ a
]

{ #category : #accessing }
A >> a: anObject [

	a := anObject
]
