from django.shortcuts import render 

# Create your views here.
def test(request):
    print("inside test function")
    return render(request, "index.html")