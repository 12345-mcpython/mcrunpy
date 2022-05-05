# mcrunpy

### English

Run Python Mod for minecraft.

This mod can run python2.7.3a1 scripts in the minecraft.

This mod use Jython to run python code.

Put the scripts into .minecraft/python to run it.

Output for python code is in .minecraft/logs/latest.log

If you want to use minecraft's API.You must be manual confusion through "client.tsrg".

Do not block the main thread!!!It will let mc stop loading!!!

Do not use input,raw_input or any other input function!!!It will let mc stop loading!!!(Unless you run mc by using the
console.But who wants to do that???)

Not support Python C Extension Library for the time being.

### Chinese

这个模组可以在mc中运行Python2.7.3a1的脚本.

这个模组使用了Jython运行脚本

把python脚本放入.minecraft/python去运行它

python脚本的输出在.minecraft/logs/latest.log

如果你想用mc的API,你必须使用client.tsrg手动进行混淆.

不要阻塞主线程!!! 它会让mc停止加载!!!

不要使用raw_input或input等任何输入函数!!! 它也会让mc停止加载!!!(除非在控制台运行mc,但谁会这么做呢)

暂时不支持Python C 扩展库.