//
//  ViewController.m
//  iOSDemo2
//
//  Created by sodino on 2021/7/20.
//

#import "ViewController.h"
#include "Core.h"
#include "NumAdd.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    int c = add(2, 3);
    NSLog(@"add(2 + 3)=%d", c);
    const char* result = concatenateMyStringWithCppString("aabbcc");
    NSLog(@"concatenate result=%s", result);
}


@end
