package bookex9;

public class Button1 {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
}
