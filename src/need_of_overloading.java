package Unit2;

public class need_of_overloading {
    int arr[]={30,56,65,45,54,43};
    int ele=45;

    SearchEle searchEle = new SearchEle();
    int x =searchEle.search(arr,ele);

}
class SearchEle
{

    public int search(int[] arr, int ele) {
        return search(arr, ele,0);
    }

    private int search(int[] arr, int ele, int i) {

        return ele;
    }
}