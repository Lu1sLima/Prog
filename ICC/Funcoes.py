#Conceito de Função (MÉTODO)
def mostraDivisores(valor): 
  for divisor in range(1, valor+1):
    if (valor % divisor == 0):
      print(divisor)
#Em métodos não utilizamos print

def testePrimo(valor1): 
  if (len(divisores(valor1)) == 2): ## SE O LEN DO RETURN DE DIVISORES(resultado) (RESULTADO FOR 2, ENTÃO ELE SÓ TEM 2 DIVISORES, OU SEJA, É PRIMO)
    return True
  else: # SE NAO FOR 2, ENTÃO NAO É PRIMO.
    return False


#Também poderia ser assim:
#def testePrimo(valor1):
  #return len(divisores(valor1))

#Dai, no main, eu teria que chamar assim:
#if testePrimo(num) == True:
#   print(numero, "é primo.")
#else:
#   print(numero, "não é primo")


def divisores(valor): 
  resultado = [] #Lista vazia
  for divisor in range(1, valor+1):
    if (valor % divisor == 0):
      resultado.append(divisor) #Adiciona elementos na lista ao final do
      #print(divisor) retirei, pois nao é bom colocar print em uma funcao(métofo)'
  return resultado # Tem que estar na mesma identação d loop, pois irá retornar APÓS ter feito todos os loops.

#*****************************************************************************#

num = int(input("Digite um número: ")) #Programa principal (main)

divs = divisores(num) #Variável que chama a função e recebe o retorno da função
if (testePrimo(num)):
  print("O número ", num, "é primo.")
else:
  print("O número ", num, "não é primo")
print("Divisores de", num, ":", divs)
print("Número de divisores: ", len(divs))
#Comando len() conta quantos elementos tem na lista e printa na tela

#mostraDivisores(num) #Chamando a função (MÉTODO)











#for divisor in range (1, num+1):
 # if (num % divisor == 0):
  #  print(divisor)
