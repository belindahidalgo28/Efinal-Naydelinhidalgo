SECTION .data ; data section 
	 numero1: dd 	2 
	 numero2: dd 	1 
	 numero3: dd 	2 
	 numero4: dd 	3 
	 mul: dd 	0 
	 sum: dd 	0 
	 res: dd 	0 
SECTION .text ; code section 
 	 global _start ; entry point 
_start: 
	mov 	 rax,numero1
	mov 	 rcx,numero2
	mul 	rcx
	mov 	[mul],rax
	mov 	 rax,numero3
	mov 	 rcx,numero4
	add 	rax,rcx
	mov 	[sum],rax
	mov 	 rax,mul
	mov 	 rcx,sum
	add 	rax,rcx
	mov 	[res],rax
final: 
	 mov 	 ebx,0 
	 mov 	 eax,1 
	 int 	 0x80